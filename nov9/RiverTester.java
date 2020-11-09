enum River{
GANGA,GODAVARI,KRISHNA,TUNGABHADRA,KAVERI,MALAPRABHA
}
public class RiverTester{
public static void main(String[] rivers)
{

System.out.println("invoked main,river name using enum");
for(int name=0;name<rivers.length;name++){
River riverName=River.valueOf(rivers[name]);

System.out.println("river name  "+riverName);
}

}

}