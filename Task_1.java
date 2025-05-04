class Task_1{

static void reverse(String vab){
int length_vab = vab.length();  
int reverse_loop=vab.length()-1;

for(int a=0;a<length_vab;a++){

System.out.print(vab.charAt(reverse_loop));
reverse_loop--;
}

}

public static void main(String []args){
reverse("name");



}}