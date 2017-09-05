package com.dogiant.api;

import java.util.List;

import com.dogiant.api.dto.ArticleCatDTO;
import com.dogiant.api.dto.ArticleItemDTO;
import com.dogiant.api.dto.SectionDTO;

public interface CmsDataService {
	
	public String hello(String hi);
	
	public SectionDTO getSectionByCode(String code);
	
	public ArticleCatDTO getArticleCatByCode(String code);
	
	public List<ArticleCatDTO> getCrumbsArticleCats(String code);
	
	public ArticleItemDTO getArticleItemById(Long id);
}
