package com.Projects.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class MP3Player {
    private List<Song> playlist;
    private int currentIndex;
    private boolean isPlaying;

    public MP3Player() {
        playlist = new ArrayList<>();
        currentIndex = 0;
        isPlaying = false;
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        isPlaying = true;
        System.out.println("Now playing: " + playlist.get(currentIndex).getTitle());
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Paused: " + playlist.get(currentIndex).getTitle());
            isPlaying = false;
        } else {
            System.out.println("Player is not currently playing.");
        }
    }

    public void resume() {
        if (!isPlaying) {
            System.out.println("Resumed: " + playlist.get(currentIndex).getTitle());
            isPlaying = true;
        } else {
            System.out.println("Player is already playing.");
        }
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("Stopped: " + playlist.get(currentIndex).getTitle());
            isPlaying = false;
        } else {
            System.out.println("Player is not currently playing.");
        }
    }

    public void next() {
        if (currentIndex < playlist.size() - 1) {
            currentIndex++;
            play();
        } else {
            System.out.println("End of playlist.");
        }
    }

    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
            play();
        } else {
            System.out.println("Beginning of playlist.");
        }
    }

    public void replay() {
        if (isPlaying) {
            System.out.println("Replaying: " + playlist.get(currentIndex).getTitle());
        } else {
            System.out.println("Player is not currently playing.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i).getTitle());
        }
    }
}

public class MP3PlayerExample {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();

        // Adding songs to the playlist
        mp3Player.addSong(new Song("Song 1"));
        mp3Player.addSong(new Song("Song 2"));
        mp3Player.addSong(new Song("Song 3"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMP3 Player Menu:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Resume");
            System.out.println("4. Stop");
            System.out.println("5. Next");
            System.out.println("6. Previous");
            System.out.println("7. Replay");
            System.out.println("8. Display Playlist");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mp3Player.play();
                    break;

                case 2:
                    mp3Player.pause();
                    break;

                case 3:
                    mp3Player.resume();
                    break;

                case 4:
                    mp3Player.stop();
                    break;

                case 5:
                    mp3Player.next();
                    break;

                case 6:
                    mp3Player.previous();
                    break;

                case 7:
                    mp3Player.replay();
                    break;

                case 8:
                    mp3Player.displayPlaylist();
                    break;

                case 9:
                    System.out.println("Exiting MP3 Player. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

// The output of the above program is shown as below
/*
MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 1
Now playing: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 2
Paused: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 3
Resumed: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 4
Stopped: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 5
Now playing: Song 2

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 6
Now playing: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 7
Replaying: Song 1

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 8
Playlist:
1. Song 1
2. Song 2
3. Song 3

MP3 Player Menu:
1. Play
2. Pause
3. Resume
4. Stop
5. Next
6. Previous
7. Replay
8. Display Playlist
9. Exit
Enter your choice: 9
Exiting MP3 Player. Goodbye!
 */