package Soal1;

public class Televisi {
  // 7. Televisi

  // Bagan
  /*+------------------------+
    |        Televisi        |
    +------------------------+
    | - merek: String        |
    | - ukuranInci: int      |
    | - channel: int         |
    | - hidup: boolean       |
    +------------------------+
    | +nyalakan(): void      |
    | +matikan(): void       |
    | +gantiChannel(int): void|
    +------------------------+
*/

  String merek;
  int ukuranInci;
  String channel;
  boolean hidup;

  public Televisi(String merek, String channel) {
    this.merek = merek;
    this.channel = channel;
  }

  public void nyalakan() {
    hidup = true;
    System.out.println("TV dinyalakan pada channel " + channel);
  }

  public void matikan() {
    hidup = false;
    System.out.println("TV dimatikan");
  }

  public void gantiChannel(String channelBaru) {
    if (hidup) {
      channel = channelBaru;
      System.out.println("Channel diganti ke " + channel);
    } else {
      System.out.println("Nyalakan TV terlebih dahulu!");
    }
  }
}
