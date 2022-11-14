package com.otsi.retail.gateway.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import com.marvinformatics.hibernate.json.JsonUserType;


public class CustomJsonType extends JsonUserType {

  public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
    return nullSafeGet(rs, names, (SessionImplementor) session, owner);
  }

  public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
    nullSafeSet(st, value, index, (SessionImplementor) session);
  }

}
