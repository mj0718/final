package meatmeet.meatmeet.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class recipeDomain {
	private int recipe_id;
	private String member_id;
	private String category1;
	private String category2;
	private String title;
	private String ingre;
	private String sauce;
	private String step;
	private String img_name;
	private String img_path;
}