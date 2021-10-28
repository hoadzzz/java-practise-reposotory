package bean;

import java.util.Objects;

public class DiskCD {
	private Integer diskId;
	private String kindOfMusic;
	private String singer;
	private Integer amountSong;
	private Double price;
	
	public DiskCD() {
	}

	public DiskCD(Integer diskId, String kindOfMusic, String singer, Integer amountSong, Double price) {
		this.diskId = diskId;
		this.kindOfMusic = kindOfMusic;
		this.singer = singer;
		this.amountSong = amountSong;
		this.price = price;
	}

	public Integer getDiskId() {
		return diskId;
	}

	public void setDiskId(Integer diskId) {
		this.diskId = diskId;
	}

	public String getKindOfMusic() {
		return kindOfMusic;
	}

	public void setKindOfMusic(String kindOfMusic) {
		this.kindOfMusic = kindOfMusic;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getAmountSong() {
		return amountSong;
	}

	public void setAmountSong(Integer amountSong) {
		this.amountSong = amountSong;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DiskCD [diskId=" + diskId + ", kindOfMusic=" + kindOfMusic + ", singer=" + singer + ", amountSong="
				+ amountSong + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diskId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiskCD other = (DiskCD) obj;
		return Objects.equals(diskId, other.diskId);
	}
	
	
}
