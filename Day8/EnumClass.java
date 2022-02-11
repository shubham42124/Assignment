class EnumClass{
public enum Day{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
public static void main(String args[]){
for(Day d:Day.values())
{
System.out.println(d);
}   
} 
}