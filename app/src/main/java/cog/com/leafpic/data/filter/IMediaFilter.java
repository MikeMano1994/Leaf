package cog.com.leafpic.data.filter;

import cog.com.leafpic.data.Media;

/**
 * Created by dnld on 4/10/17.
 */

public interface IMediaFilter {
    boolean accept(Media media);
}
