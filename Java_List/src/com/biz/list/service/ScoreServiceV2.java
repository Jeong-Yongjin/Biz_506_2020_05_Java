package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	private static final int StSum = 0;
	List<ScoreVO> scoreList; 
	
	public void stSum(List<ScoreVO> scoreList) {
		
		this.scoreList = scoreList;
		
		int scoreSize = scoreList.size();
		
		
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO sVO = scoreList.get(i);
			
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();		
			
			sVO.setStSum(sum);
		}
		
			
		}
	
	public void stAvg(List<ScoreVO> scoreList) {
		
		this.scoreList = scoreList;
		
		int scoreSize = scoreList.size();
		
		for(int i = 0 ; i < scoreSize ; i++) {
			ScoreVO sVO = scoreList.get(i);
			ScoreVO sum = this.scoreList.get(StSum);
			sVO.setStAvg(StSum / 3);
		
		}
		
	}
	
}
