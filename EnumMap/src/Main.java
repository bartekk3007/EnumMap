import java.util.EnumMap;

public class Main
{
    public static void main(String[] args)
    {
        EnumMap<Season, Integer> enumMap = new EnumMap<>(Season.class);
        enumMap.put(Season.SPRING, 1);
        System.out.println(enumMap);
    }
}