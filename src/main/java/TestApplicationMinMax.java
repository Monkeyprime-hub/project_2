public class TestApplicationMinMax {
    /**
     * @Array
     */
    public int getMax(int[] values)
    {
        int Max=values[0],Min=values[0];
        for (int i=1;i<values.length;i++)
        {
            if(Max<values[i])
            {Max=values[i];}
        }
        return Max;
    }

    public int getMin(int[] values)
    {
        int Max=values[0],Min=values[0];
        for (int i=1;i<values.length;i++)
        {
            if(Min>values[i])
            {Min=values[i];}
        }
        return Max;
    }
}