package mesa.com.outerspacemanager.outerspacemanager.model;

/**
 * Created by Lucas on 06/03/2017.
 */

public class Building {
    private int amountOfEffectByLevel;
    private int amountOfEffectLevel0 ;
    private boolean building;
    private String effect;
    private String effectAdded;
    private int gasCostByLevel;
    private int gasCostLevel0 ;
    private int level;
    private int mineralCostByLevel;
    private int mineralCostLevel0 ;
    private String name;
    private int timeToBuildByLevel;
    private int timeToBuildLevel0;
    private int buildingId;
    private String imageUrl;

    public String getName(){
        return this.name;
    }
    public String getEffect(){
        if(this.effect != null){
            return this.effect;
        }else{
            return this.effectAdded;
        }

    }
    public Integer getGazCost(){

        return (this.gasCostLevel0 + (this.level * this.gasCostByLevel));
    }
    public Integer getMineralsCost(){

        return (this.mineralCostLevel0 + (this.level * this.mineralCostByLevel));
    }
    public Integer getTimeToBuild(){

        return (this.timeToBuildLevel0 + (this.level * this.timeToBuildByLevel));
    }
    public Integer getLevel(){
        return this.level;
    }

    public int getBuildingId(){
        return this.buildingId;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }

    public boolean isBuilding(){
        return this.building;
    }
}
