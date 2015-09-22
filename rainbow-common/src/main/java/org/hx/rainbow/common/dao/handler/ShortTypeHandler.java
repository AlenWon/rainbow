/*
 *    Copyright 2009-2012 The MyBatis Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.hx.rainbow.common.dao.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShortTypeHandler extends BaseTypeHandler<Short> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, Short parameter, JdbcType jdbcType)
      throws SQLException {
    ps.setShort(i, parameter);
  }

  @Override
  public Short getNullableResult(ResultSet rs, String columnName)
      throws SQLException {
    return rs.getShort(columnName);
  }

  @Override
  public Short getNullableResult(ResultSet rs, int columnIndex)
      throws SQLException {
    return rs.getShort(columnIndex);
  }

  @Override
  public Short getNullableResult(CallableStatement cs, int columnIndex)
      throws SQLException {
    return cs.getShort(columnIndex);
  }
}
