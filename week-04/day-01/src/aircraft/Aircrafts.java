package aircraft;

public class Aircrafts {
  String type;
  private int maxAmmo;
  private int baseDamage;
  private int ammoStorage;

  public Aircrafts() {
    this.type = "";
    this.maxAmmo = 10;
    this.baseDamage = 10;
    this.ammoStorage = 0;
  }

  public Aircrafts(String type, int maxAmmo, int baseDamage, int ammoStorage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammoStorage = 0;
  }

  public int fight() {
    int ammunition = ammoStorage;
    ammoStorage = 0;
    return ammunition * baseDamage;
  }

  public int refill(int ammoRefill) {
    if (ammoRefill > maxAmmo) {
      this.ammoStorage = maxAmmo;
      return ammoRefill - maxAmmo;
    } else {
      this.ammoStorage = ammoRefill;
      return 0;
    }
  }

  public String getStatus() {
    return "Type " + this.type + ", Ammo: " + this.maxAmmo + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.maxAmmo * this.baseDamage;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public void setAmmoStorage(int ammoStorage) {
    this.ammoStorage = ammoStorage;
  }
}
