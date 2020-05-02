package cc.mrcwm.febs.job.mapper;


import cc.mrcwm.febs.job.entity.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author mrcwm
 */
public interface JobMapper extends BaseMapper<Job> {
	
	List<Job> queryList();
}