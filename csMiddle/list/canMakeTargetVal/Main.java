package csMiddle.list.canMakeTargetVal;

public class Main {
    public static void main(String[] args) {
        System.out.println(canMakeTargetVal(new int[]{3, 4, 2, 5, 1},15));
    }
    public static boolean canMakeTargetVal(int[] arr, int target){
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }
//    より良いコード
//    public static boolean canMakeTargetVal(int[] arr, int target) {
//        Set<Integer> seen = new HashSet<>();
//        for (int num : arr) {
//            if (seen.contains(target - num)) {
//                return true;
//            }
//            seen.add(num);
//        }
//        return false;
//    }
}
