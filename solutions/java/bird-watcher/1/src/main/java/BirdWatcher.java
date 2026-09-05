
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public int incrementTodaysCount() {
        return birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {     
        int sum=0;
           
        for (int i=0; i< numberOfDays; i++){
            if(i < this.birdsPerDay.length){
                sum += this.birdsPerDay[i];
            }else {
                return sum;
            }
        }
            return sum;
    }
    
    public int getBusyDays() {
        int sum = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] >=5){
                sum++;
            }
        }
        return sum;
    }
}
