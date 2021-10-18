

public class Counter
{
    int value = 0;
    void increaseByOne()
    {
        value += 1;
    }
    void decreaseByOne()
    {
        value -= 1;
    }
    void increaseByTen()
    {
        value += 10;
    }
    void decreaseByTen()
    {
        value -= 10;
    }
    void counterReset()
    {
        value = 0;
    }
    void showStatus()
    {
        System.out.print(value);
    }
}
