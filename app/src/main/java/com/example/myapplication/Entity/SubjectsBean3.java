package com.example.myapplication.Entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubjectsBean3 {
    /**
     * rating : {"max":10,"average":9.7,"details":{"1":1242,"3":17316,"2":1052,"5":975307,"4":159169},"stars":"50","min":0}
     * genres : ["犯罪","剧情"]
     * title : 肖申克的救赎
     * casts : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp"},"name_en":"Tim Robbins","name":"蒂姆·罗宾斯","alt":"https://movie.douban.com/celebrity/1054521/","id":"1054521"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.webp"},"name_en":"Morgan Freeman","name":"摩根·弗里曼","alt":"https://movie.douban.com/celebrity/1054534/","id":"1054534"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.webp"},"name_en":"Bob Gunton","name":"鲍勃·冈顿","alt":"https://movie.douban.com/celebrity/1041179/","id":"1041179"}]
     * durations : ["142分钟"]
     * collect_count : 1960486
     * mainland_pubdate :
     * has_video : true
     * original_title : The Shawshank Redemption
     * subtype : movie
     * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp"},"name_en":"Frank Darabont","name":"弗兰克·德拉邦特","alt":"https://movie.douban.com/celebrity/1047973/","id":"1047973"}]
     * pubdates : ["1994-09-10(多伦多电影节)","1994-10-14(美国)"]
     * year : 1994
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp"}
     * alt : https://movie.douban.com/subject/1292052/
     * id : 1292052
     */

    private Top250.SubjectsBean.RatingBean rating;
    private String title;
    private int collect_count;
    private String mainland_pubdate;
    private boolean has_video;
    private String original_title;
    private String subtype;
    private String year;
    private Top250.SubjectsBean.ImagesBean images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<Top250.SubjectsBean.CastsBean> casts;
    private List<String> durations;
    private List<Top250.SubjectsBean.DirectorsBean> directors;
    private List<String> pubdates;

    public Top250.SubjectsBean.RatingBean getRating() {
        return rating;
    }

    public void setRating(Top250.SubjectsBean.RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Top250.SubjectsBean.ImagesBean getImages() {
        return images;
    }

    public void setImages(Top250.SubjectsBean.ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Top250.SubjectsBean.CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<Top250.SubjectsBean.CastsBean> casts) {
        this.casts = casts;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<Top250.SubjectsBean.DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Top250.SubjectsBean.DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 9.7
         * details : {"1":1242,"3":17316,"2":1052,"5":975307,"4":159169}
         * stars : 50
         * min : 0
         */

        private int max;
        private double average;
        private Top250.SubjectsBean.RatingBean.DetailsBean details;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public Top250.SubjectsBean.RatingBean.DetailsBean getDetails() {
            return details;
        }

        public void setDetails(Top250.SubjectsBean.RatingBean.DetailsBean details) {
            this.details = details;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public static class DetailsBean {
            /**
             * 1 : 1242.0
             * 3 : 17316.0
             * 2 : 1052.0
             * 5 : 975307.0
             * 4 : 159169.0
             */

            @SerializedName("1")
            private double _$1;
            @SerializedName("3")
            private double _$3;
            @SerializedName("2")
            private double _$2;
            @SerializedName("5")
            private double _$5;
            @SerializedName("4")
            private double _$4;

            public double get_$1() {
                return _$1;
            }

            public void set_$1(double _$1) {
                this._$1 = _$1;
            }

            public double get_$3() {
                return _$3;
            }

            public void set_$3(double _$3) {
                this._$3 = _$3;
            }

            public double get_$2() {
                return _$2;
            }

            public void set_$2(double _$2) {
                this._$2 = _$2;
            }

            public double get_$5() {
                return _$5;
            }

            public void set_$5(double _$5) {
                this._$5 = _$5;
            }

            public double get_$4() {
                return _$4;
            }

            public void set_$4(double _$4) {
                this._$4 = _$4;
            }
        }
    }

    public static class ImagesBean {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p480747492.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean {
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp"}
         * name_en : Tim Robbins
         * name : 蒂姆·罗宾斯
         * alt : https://movie.douban.com/celebrity/1054521/
         * id : 1054521
         */

        private Top250.SubjectsBean.CastsBean.AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public Top250.SubjectsBean.CastsBean.AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(Top250.SubjectsBean.CastsBean.AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp"}
         * name_en : Frank Darabont
         * name : 弗兰克·德拉邦特
         * alt : https://movie.douban.com/celebrity/1047973/
         * id : 1047973
         */

        private Top250.SubjectsBean.DirectorsBean.AvatarsBeanX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public Top250.SubjectsBean.DirectorsBean.AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(Top250.SubjectsBean.DirectorsBean.AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}