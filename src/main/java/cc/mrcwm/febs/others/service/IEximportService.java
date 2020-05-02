package cc.mrcwm.febs.others.service;


import cc.mrcwm.febs.common.entity.QueryRequest;
import cc.mrcwm.febs.others.entity.Eximport;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author mrcwm
 */
public interface IEximportService extends IService<Eximport> {
    /**
     * 查询（分页）
     *
     * @param request  QueryRequest
     * @param eximport eximport
     * @return IPage<Eximport>
     */
    IPage<Eximport> findEximports(QueryRequest request, Eximport eximport);


    /**
     * 批量插入
     *
     * @param list List<Eximport>
     */
    void batchInsert(List<Eximport> list);

}
