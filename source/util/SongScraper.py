import lyricsgenius
import argparse

class SongScraper(object):

    def __init__(self, artistName, songName):
        self.artistName = artistName
        self.songName = songName

    def main(self):
        self.scrape(self.artistName, self.songName)
        self.writetxt(self.songDict["lyrics"])

    def scrape(self, artistName, songName):
        genius = lyricsgenius.Genius(
            "sxywtmvpGSwR5VegjtAmhGthXJsvtnEX3pfAvRugpA5DnvJljDqwRW-Gvjt8f6p_")
        song = genius.search_song(songName, artistName)
        self.songDict = song.to_dict()

    def writetxt(self, songLyrics):
        filename = "" + artistName + "." + songName + ".txt"
        file = open(filename,'w')
        for line in songLyrics:
            file.write(line)

def args_parse():
    global args
    parser = argparse.ArgumentParser(
        description = "Scrapes song lyrics for ColorEncrypt")
    parser.add_argument("artistName", help="Artist Name", type=str)
    parser.add_argument("songName", help="Song Name", type=str)
    args = parser.parse_args()

if __name__ == "__main__":
    try:
        args_parse()
        artistName = args.artistName
        songName = args.songName
        instance = SongScraper(artistName, songName)
        instance.main()
    except Exception as e:
        print(e)
        exit(1)
