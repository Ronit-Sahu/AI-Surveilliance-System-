<?xml version='1.0' encoding='UTF-8'?>
<Project Type="Project" LVVersion="26008000">
	<Property Name="NI.LV.All.SaveVersion" Type="Str">Editor Version</Property>
	<Property Name="NI.LV.All.SourceOnly" Type="Bool">true</Property>
	<Property Name="NI.Project.Description" Type="Str"></Property>
	<Item Name="My Computer" Type="My Computer">
		<Property Name="IOScan.Faults" Type="Str"></Property>
		<Property Name="IOScan.NetVarPeriod" Type="UInt">100</Property>
		<Property Name="IOScan.NetWatchdogEnabled" Type="Bool">false</Property>
		<Property Name="IOScan.Period" Type="UInt">10000</Property>
		<Property Name="IOScan.PowerupMode" Type="UInt">0</Property>
		<Property Name="IOScan.Priority" Type="UInt">9</Property>
		<Property Name="IOScan.ReportModeConflict" Type="Bool">true</Property>
		<Property Name="IOScan.StartEngineOnDeploy" Type="Bool">false</Property>
		<Property Name="NI.SortType" Type="Int">3</Property>
		<Property Name="server.app.propertiesEnabled" Type="Bool">true</Property>
		<Property Name="server.control.propertiesEnabled" Type="Bool">true</Property>
		<Property Name="server.tcp.enabled" Type="Bool">false</Property>
		<Property Name="server.tcp.port" Type="Int">0</Property>
		<Property Name="server.tcp.serviceName" Type="Str">My Computer/VI Server</Property>
		<Property Name="server.tcp.serviceName.default" Type="Str">My Computer/VI Server</Property>
		<Property Name="server.vi.callsEnabled" Type="Bool">true</Property>
		<Property Name="server.vi.propertiesEnabled" Type="Bool">true</Property>
		<Property Name="specify.custom.address" Type="Bool">false</Property>
		<Item Name="Project Documentation" Type="Folder">
			<Item Name="Documentation Images" Type="Folder">
				<Item Name="loc_finite_measurement.gif" Type="Document" URL="../documentation/loc_finite_measurement.gif"/>
			</Item>
			<Item Name="Finite Measurement Documentation.html" Type="Document" URL="../documentation/Finite Measurement Documentation.html"/>
		</Item>
		<Item Name="Type Definitions" Type="Folder">
			<Property Name="NI.SortType" Type="Int">0</Property>
			<Item Name="Analysis Configuration.ctl" Type="VI" URL="../controls/Analysis Configuration.ctl"/>
			<Item Name="Data.ctl" Type="VI" URL="../controls/Data.ctl"/>
			<Item Name="Graph Data.ctl" Type="VI" URL="../controls/Graph Data.ctl"/>
			<Item Name="HW Configuration.ctl" Type="VI" URL="../controls/HW Configuration.ctl"/>
			<Item Name="New Data Behavior.ctl" Type="VI" URL="../controls/New Data Behavior.ctl"/>
			<Item Name="Simulated Signal Type.ctl" Type="VI" URL="../controls/Simulated Signal Type.ctl"/>
			<Item Name="State.ctl" Type="VI" URL="../controls/State.ctl"/>
			<Item Name="UI References.ctl" Type="VI" URL="../controls/UI References.ctl"/>
			<Item Name="User Specified Data.ctl" Type="VI" URL="../controls/User Specified Data.ctl"/>
		</Item>
		<Item Name="SubVIs" Type="Folder">
			<Property Name="NI.SortType" Type="Int">0</Property>
			<Item Name="Utility VIs" Type="Folder">
				<Property Name="NI.SortType" Type="Int">0</Property>
				<Item Name="Analysis Configuration Dialog.vi" Type="VI" URL="../subVIs/Analysis Configuration Dialog.vi"/>
				<Item Name="Get Configuration File Path.vi" Type="VI" URL="../subVIs/Get Configuration File Path.vi"/>
				<Item Name="Get Scale Labels.vi" Type="VI" URL="../subVIs/Get Scale Labels.vi"/>
				<Item Name="Incorporate New Data.vi" Type="VI" URL="../subVIs/Incorporate New Data.vi"/>
				<Item Name="Load Configuration Settings from XML.vi" Type="VI" URL="../subVIs/Load Configuration Settings from XML.vi"/>
				<Item Name="Save Configuration Settings to XML.vi" Type="VI" URL="../subVIs/Save Configuration Settings to XML.vi"/>
				<Item Name="Set Enable State on Multiple Controls.vi" Type="VI" URL="../subVIs/Set Enable State on Multiple Controls.vi"/>
			</Item>
			<Item Name="Acquire Data from Hardware.vi" Type="VI" URL="../subVIs/Acquire Data from Hardware.vi"/>
			<Item Name="Copy Graph to Clipboard.vi" Type="VI" URL="../subVIs/Copy Graph to Clipboard.vi"/>
			<Item Name="Export Data.vi" Type="VI" URL="../subVIs/Export Data.vi"/>
			<Item Name="Load Data.vi" Type="VI" URL="../subVIs/Load Data.vi"/>
			<Item Name="Save Data.vi" Type="VI" URL="../subVIs/Save Data.vi"/>
			<Item Name="Settings Dialog.vi" Type="VI" URL="../subVIs/Settings Dialog.vi"/>
			<Item Name="Statistical Analysis.vi" Type="VI" URL="../subVIs/Statistical Analysis.vi"/>
		</Item>
		<Item Name="Main.vi" Type="VI" URL="../Main.vi"/>
		<Item Name="Dependencies" Type="Dependencies"/>
		<Item Name="Build Specifications" Type="Build">
			<Item Name="Finite Measurement Application" Type="EXE">
				<Property Name="App_copyErrors" Type="Bool">true</Property>
				<Property Name="App_INI_aliasGUID" Type="Str">{C9567894-8D89-411D-A407-EC631B164F65}</Property>
				<Property Name="App_INI_GUID" Type="Str">{C63E5066-CF8D-4333-97DD-EBC6D0007D3A}</Property>
				<Property Name="App_serverConfig.httpPort" Type="Int">8002</Property>
				<Property Name="App_serverType" Type="Int">1</Property>
				<Property Name="Bld_buildCacheID" Type="Str">{5BB928BB-CFD1-4498-BE92-52B2CE09F9ED}</Property>
				<Property Name="Bld_buildSpecName" Type="Str">Finite Measurement Application</Property>
				<Property Name="Bld_excludeLibraryItems" Type="Bool">true</Property>
				<Property Name="Bld_excludePolymorphicVIs" Type="Bool">true</Property>
				<Property Name="Bld_localDestDir" Type="Path">../builds/NI_AB_PROJECTNAME/Finite Measurement Application</Property>
				<Property Name="Bld_localDestDirType" Type="Str">relativeToCommon</Property>
				<Property Name="Bld_modifyLibraryFile" Type="Bool">true</Property>
				<Property Name="Bld_previewCacheID" Type="Str">{8255A065-FCBD-4530-8925-37D43FE935E2}</Property>
				<Property Name="Bld_version.major" Type="Int">1</Property>
				<Property Name="Destination[0].destName" Type="Str">Main.exe</Property>
				<Property Name="Destination[0].path" Type="Path">../builds/NI_AB_PROJECTNAME/Finite Measurement Application/Main.exe</Property>
				<Property Name="Destination[0].preserveHierarchy" Type="Bool">true</Property>
				<Property Name="Destination[0].type" Type="Str">App</Property>
				<Property Name="Destination[1].destName" Type="Str">Support Directory</Property>
				<Property Name="Destination[1].path" Type="Path">../builds/NI_AB_PROJECTNAME/Finite Measurement Application/data</Property>
				<Property Name="DestinationCount" Type="Int">2</Property>
				<Property Name="Source[0].itemID" Type="Str">{1BFB8654-0ED6-46DC-9DA8-CD744B16C1B9}</Property>
				<Property Name="Source[0].type" Type="Str">Container</Property>
				<Property Name="Source[1].destinationIndex" Type="Int">0</Property>
				<Property Name="Source[1].itemID" Type="Ref">/My Computer/Main.vi</Property>
				<Property Name="Source[1].sourceInclusion" Type="Str">TopLevel</Property>
				<Property Name="Source[1].type" Type="Str">VI</Property>
				<Property Name="SourceCount" Type="Int">2</Property>
				<Property Name="TgtF_fileDescription" Type="Str">Finite Measurement Application</Property>
				<Property Name="TgtF_internalName" Type="Str">Finite Measurement Application</Property>
				<Property Name="TgtF_legalCopyright" Type="Str">Copyright © 2012 </Property>
				<Property Name="TgtF_productName" Type="Str">Finite Measurement Application</Property>
				<Property Name="TgtF_targetfileGUID" Type="Str">{5FE5DE10-0E03-479C-92AD-775BCAF479B5}</Property>
				<Property Name="TgtF_targetfileName" Type="Str">Main.exe</Property>
			</Item>
		</Item>
	</Item>
</Project>
