
class Task_4{
static void count_alpha(String alpha){
int vowel=0;
int consonent=0;
for(int i=0;i<alpha.length();i++){
char ch=alpha.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
vowel++;
else{consonent++;}

}
System.out.println("Vowels"+vowel);
System.out.println("consonent"+consonent);

}
public static void main(String []args){

count_alpha("Kabeer");}
}