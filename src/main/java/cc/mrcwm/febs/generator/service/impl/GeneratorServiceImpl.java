package cc.mrcwm.febs.generator.service.impl;

import cc.mrcwm.febs.common.entity.FebsConstant;
import cc.mrcwm.febs.common.entity.QueryRequest;
import cc.mrcwm.febs.common.utils.SortUtil;
import cc.mrcwm.febs.generator.entity.Column;
import cc.mrcwm.febs.generator.entity.Table;
import cc.mrcwm.febs.generator.mapper.GeneratorMapper;
import cc.mrcwm.febs.generator.service.IGeneratorService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mrcwm
 */
@Service
public class GeneratorServiceImpl implements IGeneratorService {
    @Autowired
    private GeneratorMapper generatorMapper;

    @Override
    public List<String> getDatabases(String databaseType) {
        return generatorMapper.getDatabases(databaseType);
    }

    @Override
    public IPage<Table> getTables(String tableName, QueryRequest request, String databaseType, String schemaName) {
        Page<Table> page = new Page<>(request.getPageNum(), request.getPageSize());
        SortUtil.handlePageSort(request, page, "createTime", FebsConstant.ORDER_ASC, false);
        return generatorMapper.getTables(page, tableName, databaseType, schemaName);
    }

    @Override
    public List<Column> getColumns(String databaseType, String schemaName, String tableName) {
        return generatorMapper.getColumns(databaseType, schemaName, tableName);
    }
}
