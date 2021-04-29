public class Secret
{
    static int count = 0;

    private Secret()
    {
    }
    public static Secret getNewSecret()
    {
        count++;
        if(count > 2)
        {
            return null;
        }
        return new Secret();
    }
}