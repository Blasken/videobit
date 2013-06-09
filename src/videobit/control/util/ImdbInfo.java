package videobit.control.util;

public class ImdbInfo {
	private String name;
	private double rating;
	private String poster;
	private String plot;
	private int votes;
	private String[] genres;
	
	public ImdbInfo(){
	}
	
	public ImdbInfo(String name, double rating, String poster, String plot,
			int votes, String[] genres) {
		this.name = name;
		this.rating = rating;
		this.poster = poster;
		this.plot = plot;
		this.votes = votes;
		this.genres = genres;
	}
	
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public String getPoster() {
		return poster;
	}
	public String getPlot() {
		return plot;
	}
	public int getVotes() {
		return votes;
	}
	public String[] getGenres() {
		return genres;
	}
}
