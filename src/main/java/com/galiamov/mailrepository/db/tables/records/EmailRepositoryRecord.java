/**
 * This class is generated by jOOQ
 */
package com.galiamov.mailrepository.db.tables.records;


import com.galiamov.mailrepository.db.tables.EmailRepository;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmailRepositoryRecord extends UpdatableRecordImpl<EmailRepositoryRecord> implements Record3<UInteger, String, String> {

	private static final long serialVersionUID = 1120952518;

	/**
	 * Setter for <code>email_repository.email_repository.id</code>.
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>email_repository.email_repository.id</code>.
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>email_repository.email_repository.email</code>.
	 */
	public void setEmail(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>email_repository.email_repository.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>email_repository.email_repository.repository</code>.
	 */
	public void setRepository(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>email_repository.email_repository.repository</code>.
	 */
	public String getRepository() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UInteger> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UInteger, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UInteger, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return EmailRepository.EMAIL_REPOSITORY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return EmailRepository.EMAIL_REPOSITORY.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return EmailRepository.EMAIL_REPOSITORY.REPOSITORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getRepository();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailRepositoryRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailRepositoryRecord value2(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailRepositoryRecord value3(String value) {
		setRepository(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailRepositoryRecord values(UInteger value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmailRepositoryRecord
	 */
	public EmailRepositoryRecord() {
		super(EmailRepository.EMAIL_REPOSITORY);
	}

	/**
	 * Create a detached, initialised EmailRepositoryRecord
	 */
	public EmailRepositoryRecord(UInteger id, String email, String repository) {
		super(EmailRepository.EMAIL_REPOSITORY);

		setValue(0, id);
		setValue(1, email);
		setValue(2, repository);
	}
}
