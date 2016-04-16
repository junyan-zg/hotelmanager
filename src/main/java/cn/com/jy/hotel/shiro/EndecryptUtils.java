package cn.com.jy.hotel.shiro;

import org.apache.shiro.codec.Base64; 
import org.apache.shiro.codec.H64; 
import org.apache.shiro.codec.Hex; 
import org.apache.shiro.crypto.AesCipherService; 
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash; 

import cn.com.jy.hotel.domain.system.SysOperator;

import java.security.Key; 
/** 
* 备注： shiro进行加密解密的工具类封装 
*/ 
public final class EndecryptUtils { 
    /** 
     * base64进制加密 
     * 
     * @param password 
     * @return 
     */ 
    public static String encrytBase64(String password) { 
        byte[] bytes = password.getBytes(); 
        return Base64.encodeToString(bytes); 
    } 
    /** 
     * base64进制解密 
     * @param cipherText 
     * @return 
     */ 
    public static String decryptBase64(String cipherText) { 
        return Base64.decodeToString(cipherText); 
    } 
    /** 
     * 16进制加密 
     * 
     * @param password 
     * @return 
     */ 
    public static String encrytHex(String password) { 
        byte[] bytes = password.getBytes(); 
        return Hex.encodeToString(bytes); 
    } 
    /** 
     * 16进制解密 
     * @param cipherText 
     * @return 
     */ 
    public static String decryptHex(String cipherText) {  
        return new String(Hex.decode(cipherText)); 
    } 
    public static String generateKey() 
    { 
        AesCipherService aesCipherService=new AesCipherService(); 
        Key key=aesCipherService.generateNewKey(); 
        return Base64.encodeToString(key.getEncoded()); 
    } 
    /** 
     * 对密码进行md5加密,并返回密文和salt，包含在SysOperator对象中 
     * @param username 用户名 
     * @param password 密码 
     * @return 密文和salt 
     */ 
   public static SysOperator md5Password(SysOperator sysOperator){ 
	 //先使用Base64对原密码解密。
	   sysOperator.setOperatorPwd(decryptBase64(sysOperator.getOperatorPwd()));
       String salt= saltFactory(); 
        //两次迭代，对密码进行加密 
        String password_cipherText= new Md5Hash(
        		sysOperator.getOperatorPwd(),salt,2).toBase64(); 
        sysOperator.setOperatorPwd(password_cipherText);
        sysOperator.setPwdSalt(salt);
        return sysOperator; 
    }
   
   public static boolean CheckLoginMd5Password(String reqPassword,SysOperator sysOperatorFromDB){
	   //先使用Base64对原密码解密。
	   reqPassword = decryptBase64(reqPassword);
	   //然后提取实际账户私盐。两次迭代，对请求密码进行加密 
	   String password_cipherText= new Md5Hash(
			   reqPassword,sysOperatorFromDB.getPwdSalt(),2).toBase64();
	   //对比两者密码
	   return password_cipherText.equals(sysOperatorFromDB.getOperatorPwd())?true:false;
   }
   
    /** 
    * @Title: saltFactory 
    * @Description: TODO返回一个新建的salt
    * @return String    返回一个长度为32的随机字符串
    * @throws 
    */ 
    private static String saltFactory(){
    	SecureRandomNumberGenerator secureRandomNumberGenerator=new SecureRandomNumberGenerator(); 
        String salt= secureRandomNumberGenerator.nextBytes().toHex(); 
        return salt;
    }
    
    public static void main(String[] args) {
    	 String password_cipherText= new Md5Hash(
         		"123456","d62c037a8a8a2967f40380ebf18952a0",2).toBase64();
    	 System.out.println(password_cipherText);
	}
    
    public static void main1(String[] args) { 
        String password = "我很好"; 
        String cipherText = encrytHex(password); 
        System.out.println(password + "hex加密之后的密文是：" + cipherText); 
        String decrptPassword=decryptHex(cipherText); 
        System.out.println(cipherText + "hex解密之后的密码是：" + decrptPassword); 
        String cipherText_base64 = encrytBase64(password); 
        System.out.println(password + "base64加密之后的密文是：" + cipherText_base64); 
        String decrptPassword_base64=decryptBase64(cipherText_base64); 
        System.out.println(cipherText_base64 + "base64解密之后的密码是：" + decrptPassword_base64); 
        String h64=  H64.encodeToString(password.getBytes()); 
        System.out.println(h64); 
        String salt="7road"; 
        String cipherText_md5= new Md5Hash(password,salt,4).toHex(); 
        System.out.println(password+"通过md5加密之后的密文是："+cipherText_md5); 
        System.out.println(generateKey()); 
        System.out.println("=========================================================="); 
        AesCipherService aesCipherService=new AesCipherService(); 
        aesCipherService.setKeySize(128); 
        Key key=aesCipherService.generateNewKey(); 
        String aes_cipherText= aesCipherService.encrypt(password.getBytes(),key.getEncoded()).toHex(); 
        System.out.println(password+" aes加密的密文是："+aes_cipherText); 
        String aes_mingwen=new String(aesCipherService.decrypt(Hex.decode(aes_cipherText),key.getEncoded()).getBytes()); 
        System.out.println(aes_cipherText+" aes解密的明文是："+aes_mingwen); 
    } 
}
 
