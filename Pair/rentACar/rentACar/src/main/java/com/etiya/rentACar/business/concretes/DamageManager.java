package com.etiya.rentACar.business.concretes;


import com.etiya.rentACar.business.abstracts.DamageService;
import com.etiya.rentACar.business.requests.damageRequests.CreateDamageRequest;
import com.etiya.rentACar.business.responses.damageResponses.ListDamageDto;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.DamageDao;
import com.etiya.rentACar.entities.Damage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DamageManager implements DamageService {

    private DamageDao damageDao;
    private ModelMapperService modelMapperService;


    public DamageManager(DamageDao damageDao, ModelMapperService modelMapperService) {
        this.damageDao = damageDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public void add(CreateDamageRequest createDamageRequest) {

        Damage damage = this.modelMapperService.forRequest().map(createDamageRequest, Damage.class);
        this.damageDao.save(damage);

    }

    @Override
    public List<ListDamageDto> getAll() {
        List<Damage> damages = this.damageDao.findAll();
        List<ListDamageDto> response = damages.stream().map(damage -> this.modelMapperService.forDto().map(damage,ListDamageDto.class))
                .collect(Collectors.toList());
        return response;
    }

    @Override
    public List<ListDamageDto> getByCarId(int id) {
        List<Damage> damages = this.damageDao.getByCarId(id);
        List<ListDamageDto> response = damages.stream().map(damage -> this.modelMapperService.forDto()
                .map(damage,ListDamageDto.class))
                .collect(Collectors.toList());
       return response;


//        List<Damage> damages = this.damageDao.findAll();
//        List<ListDamageDto> response = damages.stream()
//                .map(damage -> this.modelMapperService.forDto()
//                .map(damage,ListDamageDto.class))
//                .filter( x -> x.getCarId()== carId )
//                .collect(Collectors.toList());


    }
}
