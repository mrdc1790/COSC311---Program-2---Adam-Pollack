public class IndexRecord {
    private IndexRecord next;
    private IndexRecord previous;
    private String key;
    private int where;

    public IndexRecord(String key, int where){
        next = null;
        previous = null;
        this.key = key.toLowerCase();
        this.where = where;
    }

    public String getKey(){
        return key;
    }

    public int getWhere(){
        return where;
    }

    public IndexRecord getNext(){
        return next;
    }

    public IndexRecord getPrevious(){
        return previous;
    }

    public void setNext(IndexRecord record){
        next = record;
    }

    public void setPrevious(IndexRecord record){
        previous = record;
    }

    public boolean isAtEnd(){
        return (next == null);
    }

    public boolean isBeginning(){
        return (previous == null);
    }

    public int compareTo(IndexRecord record){
        return this.key.compareTo(record.getKey());
    }

    public String toString(){
        return key + " " + where;
    }
}
