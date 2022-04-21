class LargestSmallestArray {
public static void main(String args[]) {
int ar[] = new int[] {12,56,76,89,100,343,21,234};
int smallest = ar[0];
int largest = ar[0];
for(int i=1;i<ar.length;i++) {
if (ar[i] > largest)
largest = ar[i];
else if (ar[i] < smallest)
smallest = ar[i];
}
System.out.println("Smallest number is :" + smallest);
System.out.println("Largest number is :" + largest);
}
}
