package MainPanel;

public class RandomNumber
{
    public static int RandomNum()
    {
        int min = 1;
        int max = 3;
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);

        return random;
    }
}
