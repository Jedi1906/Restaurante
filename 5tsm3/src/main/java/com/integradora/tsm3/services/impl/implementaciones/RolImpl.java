package com.integradora.tsm3.services.impl.implementaciones;

import com.integradora.tsm3.dao.impl.IRolDao;
import com.integradora.tsm3.models.Rol;
import com.integradora.tsm3.services.impl.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolImpl implements RolService {
    @Autowired
    private IRolDao iRolDao;

}
