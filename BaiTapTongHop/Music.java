package BaiTapTongHop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Music {
    private List<Music> musiclist;
    private int Id;

    public Music(int id, String name, String author, String year){
        this.musiclist = new ArrayList<>();
    }
    public void objAddMusic(Music music){
        musiclist.add(music);
    }
    public List<Music> getMusiclist(){
        return musiclist;
    }

        public void addMusic(){
            Scanner a = new Scanner(System.in);
            int id;
            String name, author, year;
            System.out.println("Nhap ID:");
            id = a.nextInt();
            if (musiclist.stream().allMatch(music -> music.Id != (id))){
                System.out.println("Nhap ten bai hat: ");
                a.nextLine();
                name = a.nextLine();
                System.out.println("Nhap ten tac gia: ");
                author = a.nextLine();
                System.out.println("Nhap nam sang tac: ");
                year = a.nextLine();
                Music mus = new Music(id, name, author, year);
                musiclist.add(mus);
                System.out.println("Mot bai hat duoc them thanh cong!!!");
            }
            else {
                System.out.println("Trung Id , them that bai");
            }
        }
}
