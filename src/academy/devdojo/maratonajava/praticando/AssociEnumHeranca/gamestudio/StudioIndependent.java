package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.List;

public class StudioIndependent extends Studio {

    private int staffNumber;

    public StudioIndependent(String name, List<Game> gamesList, int staffNumber) {
        super(name, gamesList);
        this.staffNumber = staffNumber;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.getName());
    return sb.toString();
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }
}
