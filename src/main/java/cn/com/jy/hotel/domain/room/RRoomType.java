package cn.com.jy.hotel.domain.room;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * RRoomType generated by hbm2java
 */
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "r_room_type", catalog = "hotel", uniqueConstraints = @UniqueConstraint(columnNames = "room_type_name"))
public class RRoomType implements java.io.Serializable {

	private Short id;
	private String roomTypeName;
	private short maxPeople;
	private String description;
	private BigDecimal deposit;
	private Set<RRoom> RRooms = new HashSet<RRoom>(0);
	private Set<RRoomPayMethod> RRoomPayMethods = new HashSet<RRoomPayMethod>(0);

	public RRoomType() {
	}

	public RRoomType(String roomTypeName, short maxPeople, BigDecimal deposit) {
		this.roomTypeName = roomTypeName;
		this.maxPeople = maxPeople;
		this.deposit = deposit;
	}

	public RRoomType(String roomTypeName, short maxPeople, String description,
			BigDecimal deposit, Set<RRoom> RRooms,
			Set<RRoomPayMethod> RRoomPayMethods) {
		this.roomTypeName = roomTypeName;
		this.maxPeople = maxPeople;
		this.description = description;
		this.deposit = deposit;
		this.RRooms = RRooms;
		this.RRoomPayMethods = RRoomPayMethods;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "room_type_name", unique = true, nullable = false, length = 128)
	public String getRoomTypeName() {
		return this.roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	@Column(name = "max_people", nullable = false)
	public short getMaxPeople() {
		return this.maxPeople;
	}

	public void setMaxPeople(short maxPeople) {
		this.maxPeople = maxPeople;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "deposit", nullable = false, precision = 11)
	public BigDecimal getDeposit() {
		return this.deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RRoomType")
	public Set<RRoom> getRRooms() {
		return this.RRooms;
	}

	public void setRRooms(Set<RRoom> RRooms) {
		this.RRooms = RRooms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RRoomType")
	public Set<RRoomPayMethod> getRRoomPayMethods() {
		return this.RRoomPayMethods;
	}

	public void setRRoomPayMethods(Set<RRoomPayMethod> RRoomPayMethods) {
		this.RRoomPayMethods = RRoomPayMethods;
	}

}
