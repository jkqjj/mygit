package cn.itcast.springmvc.domain;

public class Person {

	private String id;
	private String name;
	private String address;
	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		System.out.println("���ڵ���setId���� ,id=" + id);
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "{id:"+id+",name:"+name+",address:"+address+"}";
	}
}
