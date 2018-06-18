package cog.com.leafpic.interfaces;

import cog.com.leafpic.data.Album;
import cog.com.leafpic.data.Media;

import java.util.ArrayList;

public interface MediaClickListener {

    void onMediaClick(Album album, ArrayList<Media> media, int position);
}
