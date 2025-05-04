class Task_2{

static void Palindrome_check(String vab){
int length_vab = vab.length();  
int reverse_loop=vab.length()-1;
String check="";
for(int a=0;a<length_vab;a++){
check +=vab.charAt(reverse_loop);
reverse_loop--;
}

if(check.equals(vab))
System.out.println("Yes,This is a Palindrome");
else
System.out.println("Nooo,This is not a Palindrome");

}
public static void main(String []args){
Palindrome_check("madam");



}}