package com.test.oop;
import java.util.Arrays;

public class Movie
{

	static int	movie_start[]	= { 10, 12, 9, 14, 16, 14 };

	static int	movie_end[]		= { 11, 13, 15, 16, 18, 18 };

	static int	cntr			= 0;

	static int getMin(int[] movie_time)
	{
		Arrays.sort(movie_time);
		return movie_time[0];
	}

	static int getMax(int[] movie_time)
	{
		Arrays.sort(movie_time);
		return movie_time[movie_time.length - 1];
	}

	static int getMaxMovies(int[] movie_start, int[] movie_end)
	{

		int[] movie_diff = new int[movie_start.length];

		for (int i = 0; i < movie_start.length; i++)
		{
			movie_diff[i] = movie_end[i] - movie_start[i];

		}

		int movie_max = getMax(movie_end) - getMin(movie_start);

		int totaltime = 0;
		for (int i = 0; i < movie_diff.length; i++)
		{
			if (totaltime < movie_max)
			{
				++cntr;
				totaltime += movie_diff[i];
			}
			else
			{
				return cntr;
			}
			//System.out.println(movie_diff[i]);
		}

		//System.out.println("total time:" + movie_max);

		return cntr;
	}

	public static void main(String[] args)
	{
		System.out.println(Movie.getMaxMovies(movie_start, movie_end));

	}

}
