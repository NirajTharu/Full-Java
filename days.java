public enum days {
    
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THRUSDAY(5),FRIDAY(6),SATURDAY(7);

    private final int dayNumber;
    days(int dayNumber)
    {
        this.dayNumber = dayNumber;
    }
    public int getdayNumber()
    {
        return this.dayNumber;
    }
}
