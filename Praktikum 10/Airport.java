public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin mendarat diberikan";
        } else {
            return "Izin mendarat ditolak";
        }
    }
}
