package model;

import java.util.GregorianCalendar;

import persistence.Date;

public class League {
    private String name;
    private Integer leagueID;
    private int capacity;
    private Date startDate;
    private Date endDate;
    private Difficulty difficulty;
    private String owner;
    
    public League() {
        leagueID = null;
        name = null;
        capacity = 0;
        startDate = null;
        endDate = null;
        difficulty = null;
    }
    
    public League(Integer id, String name, int capacity, Date startDate, Date endDate, Difficulty difficulty, String
            owner) {
        this.leagueID = id;
        this.name = name;
        this.capacity = capacity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.difficulty = difficulty;
        this.owner = owner;
    }
    
    /**
     * @return name of the league
     */
    public String getName() {
        return name;
    }
    
    public Integer getLeagueID() {
        return leagueID;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public GregorianCalendar getStartDate() {
        return startDate;
    }
    
    public GregorianCalendar getEndDate() {
        return endDate;
    }
    
    public Difficulty getDifficulty() {
        return difficulty;
    }
    
    /**
     * @return name of the league
     */
    @Override
    public String toString() {
        return name;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        
        return this.name.equals(((League) obj).getName());
    }
}
