<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 9.0.0.final using JasperReports Library version 6.21.0-4f56c4f36cd19e17675219a9ac4692d5f0f13b06  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="EmployeeDetailsSubreport" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" uuid="0664f5dd-033d-41a5-a272-f2acd5f1452b">
	<property name="com.jaspersoft.studio.data.sql.tables" value=""/>
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="final"/>
	<parameter name="ID" class="java.lang.Integer">
		<defaultValueExpression><![CDATA[new Integer(1)]]></defaultValueExpression>
	</parameter>
	<queryString language="SQL">
		<![CDATA[SELECT Employee_ID,
	Employee_Name, Department,
	Salary_KSH, Hire_Date,
	Address,
	Contact_Information
FROM employee_details
where Employee_ID = $P{ID}]]>
	</queryString>
	<field name="Employee_ID" class="java.lang.Integer">
		<property name="com.jaspersoft.studio.field.name" value="Employee_ID"/>
		<property name="com.jaspersoft.studio.field.label" value="Employee_ID"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Employee_Name" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Employee_Name"/>
		<property name="com.jaspersoft.studio.field.label" value="Employee_Name"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Department" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Department"/>
		<property name="com.jaspersoft.studio.field.label" value="Department"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Salary_KSH" class="java.lang.Integer">
		<property name="com.jaspersoft.studio.field.name" value="Salary_KSH"/>
		<property name="com.jaspersoft.studio.field.label" value="Salary_KSH"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Hire_Date" class="java.sql.Date">
		<property name="com.jaspersoft.studio.field.name" value="Hire_Date"/>
		<property name="com.jaspersoft.studio.field.label" value="Hire_Date"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Address" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Address"/>
		<property name="com.jaspersoft.studio.field.label" value="Address"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Contact_Information" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Contact_Information"/>
		<property name="com.jaspersoft.studio.field.label" value="Contact_Information"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<group name="Employee_ID">
		<groupExpression><![CDATA[$F{Employee_ID}]]></groupExpression>
	</group>
	<group name="Employee_Name">
		<groupExpression><![CDATA[$F{Employee_Name}]]></groupExpression>
	</group>
	<group name="Department">
		<groupExpression><![CDATA[$F{Department}]]></groupExpression>
	</group>
	<group name="Salary_KSH">
		<groupExpression><![CDATA[$F{Salary_KSH}]]></groupExpression>
	</group>
	<group name="Hire_Date">
		<groupExpression><![CDATA[$F{Hire_Date}]]></groupExpression>
	</group>
	<group name="Address">
		<groupExpression><![CDATA[$F{Address}]]></groupExpression>
	</group>
	<group name="Contact_Information">
		<groupExpression><![CDATA[$F{Contact_Information}]]></groupExpression>
	</group>
	<background>
		<band splitType="Stretch"/>
	</background>
	<detail>
		<band height="28" splitType="Stretch">
			<textField>
				<reportElement x="0" y="0" width="138" height="14" uuid="0844dc83-4416-4110-8cdd-b3715f98149e">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="a621c45b-dc65-401d-b84b-6193c9cbfdcc"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Address}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="0" y="14" width="138" height="14" uuid="d8b7c797-28fe-4420-ae5a-f5444b95360b">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="1df01d6b-517b-4bb1-a1de-386464266ff2"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Contact_Information}]]></textFieldExpression>
			</textField>
		</band>
	</detail>
</jasperReport>
