/**   
 * @Title: RRoomGroupServiceImpl.java 
 * @Package cn.com.jy.hotel.service.impl.system 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月14日 上午10:41:35 
 * @version V1.0   
 */
package cn.com.jy.hotel.service.impl.room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.jy.hotel.dao.BaseDao;
import cn.com.jy.hotel.dao.room.RRoomGroupDao;
import cn.com.jy.hotel.domain.Tree;
import cn.com.jy.hotel.domain.room.RRoomGroup;
import cn.com.jy.hotel.service.impl.BaseServiceImpl;
import cn.com.jy.hotel.service.room.RRoomGroupService;
import cn.com.jy.hotel.service.room.RRoomService;

/**
 * @ClassName: RRoomGroupServiceImpl
 * @Description: TODO
 * @author zjy
 * @date 2016年4月14日 上午10:41:35
 * 
 */
@Service("rRoomGroupService")
public class RRoomGroupServiceImpl extends BaseServiceImpl<RRoomGroup>
		implements RRoomGroupService {

	@Resource
	private RRoomGroupDao rRoomGroupDao;
	@Resource
	private RRoomService rRoomService;

	@Override
	protected BaseDao<RRoomGroup> getBaseDao() {
		return rRoomGroupDao;
	}

	@Override
	public List<Tree> getAllRoomGroup() throws Exception {
		List<RRoomGroup> list = getBaseDao().getAll(true);
		Map<Short, List<Tree>> map = new HashMap<>();
		Map<Short, Tree> mapID = new HashMap<>();
		for (RRoomGroup roomGroup : list) {
			Tree tree = new Tree(roomGroup.getId(), roomGroup.getGroupName());
			if (!map.containsKey(roomGroup.getParentId())) {
				List<Tree> treeList = new ArrayList<Tree>();
				treeList.add(tree);
				map.put(roomGroup.getParentId(), treeList);
			} else {
				List<Tree> treeList = map.get(roomGroup.getParentId());
				treeList.add(tree);
			}
			mapID.put(tree.getId(), tree);
		}
		Tree tree = new Tree((short) 0, "酒店");
		tree.setIconCls("icon-house");
		Set<Short> keySet = map.keySet();
		for (Short pid : keySet) {
			if (pid == 0) {
				tree.setChildren(map.get(pid));
			} else {
				mapID.get(pid).setChildren(map.get(pid));
			}
		}
		List<Tree> treeList = new ArrayList<Tree>();
		treeList.add(tree);
		return treeList;
	}

	@Override
	public void updateRoomGroup(Short id, String newName) throws Exception {
		RRoomGroup group = getBaseDao().getById(id);
		group.setGroupName(newName);
		getBaseDao().update(group);
	}

	@Override
	public void addRoomGroup(Short pid, String name) throws Exception {
		RRoomGroup group = new RRoomGroup();
		group.setParentId(pid);
		group.setGroupName(name);
		getBaseDao().add(group);
	}

	@Override
	public void delroomGroup(Short pid) throws Exception {
		List<RRoomGroup> list = getBaseDao().getAll(true);
		Map<Short, List<Tree>> map = new HashMap<>();
		Map<Short, Tree> mapID = new HashMap<>();
		for (RRoomGroup roomGroup : list) {
			Tree tree = new Tree(roomGroup.getId(), roomGroup.getGroupName());
			if (!map.containsKey(roomGroup.getParentId())) {
				List<Tree> treeList = new ArrayList<Tree>();
				treeList.add(tree);
				map.put(roomGroup.getParentId(), treeList);
			} else {
				List<Tree> treeList = map.get(roomGroup.getParentId());
				treeList.add(tree);
			}
			mapID.put(tree.getId(), tree);
		}
		Set<Short> keySet = map.keySet();
		for (Short p_id : keySet) {
			if (p_id == 0) {
				continue;
			}
			mapID.get(p_id).setChildren(map.get(p_id));
		}

		List<Tree> targetTree = map.get(pid);
		Set<Short> ids = new HashSet<>();
		ids.add(pid);
		recurseChild(targetTree, ids);

		rRoomService.delByConditions("RRoomGroup.id", ids);
		getBaseDao().delByConditions("id", ids);

		return;
	}

	private void recurseChild(List<Tree> list, Set<Short> ids) {
		if (list == null || list.size() == 0) {
			return;
		}
		for (Tree tree : list) {
			ids.add(tree.getId());
			recurseChild(tree.getChildren(), ids);
		}
	}

	@Override
	public String getAllRoomGroupHtml() throws Exception {
		
		return recursion(getAllRoomGroup().get(0).getChildren()).toString();
	}

	private static String recursion(List<Tree> trees) {
		StringBuffer stringBuffer = new StringBuffer();
		if (trees != null) {
			for (Tree tree : trees) {
				if (tree.getChildren() != null && tree.getChildren().size() > 0) {
					stringBuffer.append("<div id='");
					stringBuffer.append(tree.getId());
					stringBuffer.append("' data-options=\"iconCls:'icon-house2'\">");
					stringBuffer.append("<span>");
					stringBuffer.append(tree.getText());
					stringBuffer.append("</span>");
					stringBuffer.append("<div style='width:100px;'>");
					stringBuffer.append(recursion(tree.getChildren()));
					stringBuffer.append("</div>");
					stringBuffer.append("</div>");
				} else {
					stringBuffer.append("<div id='"); 
					stringBuffer.append(tree.getId());
					stringBuffer.append("' data-options=\"iconCls:'icon-house2'\">");
					stringBuffer.append(tree.getText()); 
					stringBuffer.append("</div>");
				}
			}
		}
		return stringBuffer.toString();
	}
	
	@Override
	public Set<Short> getAllChild(Short parentId,boolean useCache) throws Exception {
		List<RRoomGroup> list = getBaseDao().getAll(useCache);
		Map<Short, List<Tree>> mapParentIDAsKey = new HashMap<>();
		Map<Short, Tree> mapIDAsKey = new HashMap<>();
		for (RRoomGroup roomGroup : list) {
			Tree tree = new Tree(roomGroup.getId());
			if (!mapParentIDAsKey.containsKey(roomGroup.getParentId())) {
				List<Tree> treeList = new ArrayList<Tree>();
				treeList.add(tree);
				mapParentIDAsKey.put(roomGroup.getParentId(), treeList);
			} else {
				List<Tree> treeList = mapParentIDAsKey.get(roomGroup.getParentId());
				treeList.add(tree);
			}
			mapIDAsKey.put(tree.getId(), tree);
		}
		Tree tree = new Tree((short) 0);
		Set<Short> keySet = mapParentIDAsKey.keySet();
		for (Short pid : keySet) {
			if (pid == 0) {
				tree.setChildren(mapParentIDAsKey.get(pid));
			} else {
				mapIDAsKey.get(pid).setChildren(mapParentIDAsKey.get(pid));
			}
		}
		if (parentId==null) {
			return null;
		}
		Set<Short> ids = new HashSet<>();
		ids.add(parentId);
		List<Tree> targetChilds = mapIDAsKey.get(parentId).getChildren();
		recurseChild(targetChilds, ids);
		return ids;
	}

}