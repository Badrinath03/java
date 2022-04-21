class DuplicateElement {
public static void main(String args[]) {
int[] ar = new int[] {1,2,3,4,2,7,8,8,3};
System.out.println("Duplicate Elecments in given array :");
for(int i=0;i<ar.length;i++) {
for (int j=i+1;j<ar.length;j++) {
if (ar[i]==ar[j])
System.out.println(ar[j]);
}
}
}
}