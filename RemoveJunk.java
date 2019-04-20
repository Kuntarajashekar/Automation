package practice.com;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String str="$@$^%^%&welcome$^&* to#$%% @@@&java@@(;";
		
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(replaceAll);
		
		
		
	}
}
