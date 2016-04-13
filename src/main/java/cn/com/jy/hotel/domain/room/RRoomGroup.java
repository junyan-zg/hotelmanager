package cn.com.jy.hotel.domain.room;

// Generated 2016-4-14 2:43:54 by Hibernate Tools 4.3.1

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

/**
 * RRoomGroup generated by hbm2java
 */
@Entity
@Table(name = "r_room_group", catalog = "hotel", uniqueConstraints = @UniqueConstraint(columnNames = {
		"group_name", "parent_id" }))
public class RRoomGroup implements java.io.Serializable {

	private Short id;
	private String groupName;
	private String remark;
	private int parentId;
	private Set<RRoom> RRooms = new HashSet<RRoom>(0);

	public RRoomGroup() {
	}

	public RRoomGroup(String groupName, int parentId) {
		this.groupName = groupName;
		this.parentId = parentId;
	}

	public RRoomGroup(String groupName, String remark, int parentId,
			Set<RRoom> RRooms) {
		this.groupName = groupName;
		this.remark = remark;
		this.parentId = parentId;
		this.RRooms = RRooms;
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

	@Column(name = "group_name", nullable = false, length = 64)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "remark", length = 65535)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "parent_id", nullable = false)
	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RRoomGroup")
	public Set<RRoom> getRRooms() {
		return this.RRooms;
	}

	public void setRRooms(Set<RRoom> RRooms) {
		this.RRooms = RRooms;
	}

}
