// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.exchange.hibernate;

import java.util.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.suiswapexample.domain.*;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.test.suiswapexample.domain.exchange.*;
import org.test.suiswapexample.specialization.*;
import org.test.suiswapexample.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateExchangeStateQueryRepository implements ExchangeStateQueryRepository {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    private static final Set<String> readOnlyPropertyPascalCaseNames = new HashSet<String>(Arrays.asList("Id", "Name", "TokenPairs", "XTokenTypes", "YTokenTypes", "OffChainVersion", "CreatedBy", "CreatedAt", "UpdatedBy", "UpdatedAt", "Active", "Deleted", "Version"));
    
    private ReadOnlyProxyGenerator readOnlyProxyGenerator;
    
    public ReadOnlyProxyGenerator getReadOnlyProxyGenerator() {
        return readOnlyProxyGenerator;
    }

    public void setReadOnlyProxyGenerator(ReadOnlyProxyGenerator readOnlyProxyGenerator) {
        this.readOnlyProxyGenerator = readOnlyProxyGenerator;
    }

    @Transactional(readOnly = true)
    public ExchangeState get(String id) {

        ExchangeState state = (ExchangeState)getCurrentSession().get(AbstractExchangeState.SimpleExchangeState.class, id);
        if (getReadOnlyProxyGenerator() != null && state != null) {
            return (ExchangeState) getReadOnlyProxyGenerator().createProxy(state, new Class[]{ExchangeState.SqlExchangeState.class}, "getStateReadOnly", readOnlyPropertyPascalCaseNames);
        }
        return state;
    }

    @Transactional(readOnly = true)
    public Iterable<ExchangeState> getAll(Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(ExchangeState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
         addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<ExchangeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(ExchangeState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<ExchangeState> get(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        Criteria criteria = getCurrentSession().createCriteria(ExchangeState.class);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public ExchangeState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders) {
        List<ExchangeState> list = (List<ExchangeState>)get(filter, orders, 0, 1);
        if (list == null || list.size() <= 0)
        {
            return null;
        }
        return list.get(0);
    }

    @Transactional(readOnly = true)
    public ExchangeState getFirst(Map.Entry<String, Object> keyValue, List<String> orders) {
        List<Map.Entry<String, Object>> filter = new ArrayList<>();
        filter.add(keyValue);
        return getFirst(filter, orders);
    }

    @Transactional(readOnly = true)
    public Iterable<ExchangeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        Map.Entry<String, Object> keyValue = new java.util.AbstractMap.SimpleEntry<String, Object> (propertyName, propertyValue);
        List<Map.Entry<String, Object>> filter = new ArrayList<Map.Entry<String, Object>>();
        filter.add(keyValue);
        return get(filter, orders, firstResult, maxResults);
    }

    @Transactional(readOnly = true)
    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        Criteria criteria = getCurrentSession().createCriteria(ExchangeState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null) {
            HibernateUtils.criteriaAddFilter(criteria, filter);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public long getCount(org.dddml.support.criterion.Criterion filter) {
        Criteria criteria = getCurrentSession().createCriteria(ExchangeState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null)
        {
            org.hibernate.criterion.Criterion hc = CriterionUtils.toHibernateCriterion(filter);
            criteria.add(hc);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }


    protected static void addNotDeletedRestriction(Criteria criteria) {
        criteria.add(org.hibernate.criterion.Restrictions.or(
                org.hibernate.criterion.Restrictions.isNull("deleted"),
                org.hibernate.criterion.Restrictions.eq("deleted", false)
        ));
    }

}

