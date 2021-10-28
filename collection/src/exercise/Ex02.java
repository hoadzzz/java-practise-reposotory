package exercise;
/**
 * 
- Phương thức sắp xếp danh sách tĕng dần theo tựa CD.
Viết class thực thi cho phần kiểm thử. Dùng menu case thực hiện các chức năng
theo yêu cầu.
 * @author USER
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import bean.DiskCD;

public class Ex02 {
	public static void main(String[] args) {
		List<DiskCD> disks = getAll();
		
		boolean dup = addDuplicate(disks, new DiskCD(9, "Jazz", "BigBang", 21, 21.5));
		
		System.out.println("add duplicate: " +dup);
		System.out.println("size: " + disks.size());
		System.out.println("total price: " + totalPrice(disks));
		
		System.out.println("==================================");
		disks.sort(Comparator.comparing(DiskCD::getPrice));
		
		for (DiskCD disk : disks) {
			System.out.println(disk);
		}
		
		System.out.println("================================");
		disks.sort(Comparator.comparing(DiskCD::getSinger).reversed());
		
		for (DiskCD disk : disks) {
			System.out.println(disk);
		}
	}
	
	private static Double totalPrice(List<DiskCD> list) {
		Objects.requireNonNull(list);
		
		Double result = 0d;
		for (DiskCD diskCD : list) {
			result += diskCD.getPrice();
		}
		
		return result;
		
	}
	
	private static boolean addDuplicate(List<DiskCD> list, DiskCD elements) {
		Objects.requireNonNull(list);
		
		if(list.contains(elements)) {
			return false;
		}
		list.add(elements);
		return true;
	}
	
	private static List<DiskCD> init(DiskCD ...elements){
		List<DiskCD> cds = new ArrayList<>();
		cds.addAll(Arrays.asList(elements));
		return cds;
	}
	
	private static List<DiskCD> getAll(){
		List<DiskCD> result = init(new DiskCD(1, "Rock", "MyTam", 5, 7.5d),
								   new DiskCD(2, "Rap", "LeQuyen", 7, 8.5d),
								   new DiskCD(3, "Pop", "SonTung", 9, 7.5d),
								   new DiskCD(4, "Ballad", "DenVau", 8, 12.5d),
								   new DiskCD(5, "Bollero", "Binz", 12, 10.0d));
		return result;
	}
}
