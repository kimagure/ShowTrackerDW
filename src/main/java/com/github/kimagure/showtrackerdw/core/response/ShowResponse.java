package com.github.kimagure.showtrackerdw.core.response;

import com.github.kimagure.showtrackerdw.core.models.Show;

/**
 * Created with IntelliJ IDEA.
 * User: jwoo
 * Date: 2/17/14
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShowResponse {
    private final Show show;

    public ShowResponse(Show show) {
        this.show = show;
    }

    public Show getShow() {
        return show;
    }
}
