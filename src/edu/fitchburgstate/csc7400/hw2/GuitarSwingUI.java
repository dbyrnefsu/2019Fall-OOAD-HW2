/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */

package edu.fitchburgstate.csc7400.hw2;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * GuitarRun provides a simple search interface for Rick's Guitars. It is meant for testing.
 * 
 * @author omontalv
 *
 */
public class GuitarSwingUI {
	
	public final static double PRICE_MIN = 0.0;
	public final static double PRICE_MAX = 20000.0;
	
	public final static String DEFAULT_NAME = Messages.getString("GuitarRun.DefaultName"); //$NON-NLS-1$
	public final static String GREETING = Messages.getString("GuitarRun.Hi"); //$NON-NLS-1$
	public final static String WHEN_READY = Messages.getString("GuitarRun.WhenReady"); //$NON-NLS-1$
	public final static String NOT_FOUND = Messages.getString("GuitarRun.NotFound"); //$NON-NLS-1$
	public final static String FOUND = Messages.getString("GuitarRun.Found"); //$NON-NLS-1$
	
	private final static String WILD_CARD = InventoryTestData.NONE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuitarSwingUI window = new GuitarSwingUI();
					window.frmRicksGuitars.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuitarSwingUI() {
		InventoryTestData.initializeInventory(inventory);
		initialize();
	}
	
	/**
	 * Create and return the list of choices including the wild card
	 * 
	 * @param list the list of choices for a drop box
	 * @return list of choices with the wild card value prepended
	 */
	private String[] createLookupList(String[] list) {
		List<String> choices = new ArrayList<String>();
		choices.add(WILD_CARD);
		choices.addAll(Arrays.asList(list));
		String[] ret = new String[choices.size()];
		return choices.toArray(ret);
	}

	/**
	 * Returns null for wild card otherwise returns value
	 * 
	 * @param chosen the chosen value
	 * @return the chosen value or null if wild card was chosen
	 */
	private String getChosen(String chosen) {
		if (WILD_CARD.equals(chosen)) return null;
		else return chosen;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] manufacturers = createLookupList(GuitarManufacturer.getStringArray());
		String[] types = createLookupList(GuitarType.getStringArray());
		String[] woods = createLookupList(GuitarWood.getStringArray());
		
		frmRicksGuitars = new JFrame();
		frmRicksGuitars.setTitle(Messages.getString("GuitarRun.Title")); //$NON-NLS-1$
		frmRicksGuitars.setBounds(100, 100, 1000, 1000);
		frmRicksGuitars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container windowContentPane = frmRicksGuitars.getContentPane(); 
		BoxLayout overallLayout = new BoxLayout(windowContentPane, BoxLayout.PAGE_AXIS);
		windowContentPane.setLayout(overallLayout);
	
		JPanel questionPane = new JPanel(new GridLayout(0, 2, 5, 5));
		windowContentPane.add(questionPane);

		// Name field
		JLabel lblWhatsYourName = new JLabel(Messages.getString("GuitarRun.NameLabel")); //$NON-NLS-1$
		questionPane.add(lblWhatsYourName); //$NON-NLS-1$
		
		txtEnterName = new JTextField();
		addChangeListener(txtEnterName, c -> {
			setGreeting();
		});
		questionPane.add(txtEnterName); //$NON-NLS-1$
		txtEnterName.setColumns(10);
		
		//Explanation
		JLabel lblWhatTypeOf = new JLabel(Messages.getString("GuitarRun.Explanation")); //$NON-NLS-1$
		questionPane.add(lblWhatTypeOf); //$NON-NLS-1$
		
		// Clear search button
		JButton btnNewSearch = new JButton(Messages.getString("GuitarRun.ClearButton")); //$NON-NLS-1$
		btnNewSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				manufacturerComboBox.setSelectedItem(WILD_CARD);
				typeComboBox.setSelectedItem(WILD_CARD);
				topWoodComboBox.setSelectedItem(WILD_CARD);
				backWoodComboBox.setSelectedItem(WILD_CARD);
				txtEnterModel.setText(null);
				lowSpinner.setValue(PRICE_MIN);
				highSpinner.setValue(PRICE_MAX);
				matchingGuitars.clear();
				setGreeting();
			}
		});
		btnNewSearch.setToolTipText(Messages.getString("GuitarRun.ClearButtonTip")); //$NON-NLS-1$
		questionPane.add(btnNewSearch); //$NON-NLS-1$
		
		// Manufacturer choice
		JLabel lblManufacturer = new JLabel(Messages.getString("GuitarRun.BuilderLabel")); //$NON-NLS-1$
		questionPane.add(lblManufacturer); //$NON-NLS-1$
		
		manufacturerComboBox = new JComboBox<String>();
		manufacturerComboBox.setToolTipText(Messages.getString("GuitarRun.BuilderTip")); //$NON-NLS-1$
		manufacturerComboBox.setModel(new DefaultComboBoxModel<String>(manufacturers));
		manufacturerComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) setWhenReady();
			}
		});
		questionPane.add(manufacturerComboBox); //$NON-NLS-1$
		
		// Type of guitar choice
		JLabel lblTypeOfGuitar = new JLabel(Messages.getString("GuitarRun.TypeLabel")); //$NON-NLS-1$
		questionPane.add(lblTypeOfGuitar); //$NON-NLS-1$
		
		typeComboBox = new JComboBox<String>();
		typeComboBox.setToolTipText(Messages.getString("GuitarRun.TypeTip")); //$NON-NLS-1$
		typeComboBox.setModel(new DefaultComboBoxModel<String>(types));
		typeComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) setWhenReady();
			}
		});
		questionPane.add(typeComboBox); //$NON-NLS-1$
		
		// Top wood choice
		JLabel lblTopWood = new JLabel(Messages.getString("GuitarRun.TopWoodLabel")); //$NON-NLS-1$
		questionPane.add(lblTopWood); //$NON-NLS-1$
		
		topWoodComboBox = new JComboBox<String>();
		topWoodComboBox.setToolTipText(Messages.getString("GuitarRun.TopWoodTip")); //$NON-NLS-1$
		topWoodComboBox.setModel(new DefaultComboBoxModel<String>(woods));
		topWoodComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) setWhenReady();
			}
		});
		questionPane.add(topWoodComboBox); //$NON-NLS-1$
		
		// Back wood choice
		JLabel lblBackWood = new JLabel(Messages.getString("GuitarRun.BackWoodLabel")); //$NON-NLS-1$
		questionPane.add(lblBackWood); //$NON-NLS-1$
		
		backWoodComboBox = new JComboBox<String>();
		backWoodComboBox.setToolTipText(Messages.getString("GuitarRun.BackWoodTip")); //$NON-NLS-1$
		backWoodComboBox.setModel(new DefaultComboBoxModel<String>(woods));
		backWoodComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) setWhenReady();
			}
		});
		questionPane.add(backWoodComboBox); //$NON-NLS-1$
		
		// Enter model
		JLabel lblModel = new JLabel(Messages.getString("GuitarRun.ModelLabel")); //$NON-NLS-1$
		questionPane.add(lblModel); //$NON-NLS-1$
		
		txtEnterModel = new JTextField();
		txtEnterModel.setToolTipText(Messages.getString("GuitarRun.ModelTip")); //$NON-NLS-1$
		txtEnterModel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				setWhenReady();
			}
		});
		questionPane.add(txtEnterModel); //$NON-NLS-1$
		txtEnterModel.setColumns(10);
		
		// Price range, will have low and hi
		JLabel lblPriceRange = new JLabel(Messages.getString("GuitarRun.PriceRange")); //$NON-NLS-1$
		questionPane.add(lblPriceRange); //$NON-NLS-1$
		JLabel nothinglabel = new JLabel(""); //$NON-NLS-1$
		questionPane.add(nothinglabel); //$NON-NLS-1$
		
		// Low price range
		lowSpinner = new JSpinner();
		lowSpinner.setToolTipText(Messages.getString("GuitarRun.PriceLowTip")); //$NON-NLS-1$
		lowSpinner.setModel(new SpinnerNumberModel(0.0, PRICE_MIN, PRICE_MAX, 1.0));
		JLabel lblLow = new JLabel(Messages.getString("GuitarRun.PriceLow")); //$NON-NLS-1$
		lblLow.setLabelFor(lowSpinner);
		questionPane.add(lblLow); //$NON-NLS-1$
		
		lowSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Double high = (Double) highSpinner.getValue();
				Double low = (Double) lowSpinner.getValue();
				if (high < low) {
					highSpinner.setValue(low);
				}
				setWhenReady();
			}
		});
		questionPane.add(lowSpinner); //$NON-NLS-1$
		// High price range
		JLabel lblHigh = new JLabel(Messages.getString("GuitarRun.PriceHigh")); //$NON-NLS-1$
		questionPane.add(lblHigh); //$NON-NLS-1$
		
		highSpinner = new JSpinner();
		highSpinner.setToolTipText(Messages.getString("GuitarRun.PriceHighTip")); //$NON-NLS-1$
		highSpinner.setModel(new SpinnerNumberModel(PRICE_MAX, PRICE_MIN, PRICE_MAX, 1.0));
		lblHigh.setLabelFor(highSpinner);
		highSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Double high = (Double) highSpinner.getValue();
				Double low = (Double) lowSpinner.getValue();
				if (high < low) {
					lowSpinner.setValue(high);
				}
				setWhenReady();
			}
		});
		questionPane.add(highSpinner); //$NON-NLS-1$
		
		// Search button
		btnSearch = new JButton(Messages.getString("GuitarRun.SearchButton")); //$NON-NLS-1$
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( manufacturerComboBox.getSelectedItem());
				GuitarManufacturer manufacturer = GuitarManufacturer.getValueFromName((String)manufacturerComboBox.getSelectedItem());
				GuitarType type = GuitarType.getValueFromName((String) typeComboBox.getSelectedItem());
				GuitarWood topWood = GuitarWood.getValueFromName((String) topWoodComboBox.getSelectedItem());
				GuitarWood backWood = GuitarWood.getValueFromName((String) backWoodComboBox.getSelectedItem());
				String model = txtEnterModel.getText();
				GuitarSpec spec = new GuitarSpec(manufacturer, type, topWood, backWood, model);
				if (model != null && model.isEmpty()) model = null;
				//double priceLow = (double) lowSpinner.getValue();
				//double priceHigh = (double) highSpinner.getValue();
				
				Guitar searchGuitar = new Guitar(null, 0, spec, 0);
				List<Guitar> allMatchingGuitars = inventory.searchAll(searchGuitar);

				matchingGuitars.clear();
				if (allMatchingGuitars.size() == 0) {
					setNotFound();
				}
				else {
					setFound(allMatchingGuitars.size());
					for (Guitar g: allMatchingGuitars) {
						matchingGuitars.addElement(g.toString());
					}
				}
			}
		});
		questionPane.add(btnSearch); //$NON-NLS-1$
		
		btnStop = new JButton(Messages.getString("GuitarRun.btnStop.text")); //$NON-NLS-1$
		btnStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		questionPane.add(btnStop);
		
		//Results
		JPanel resultsPane = new JPanel();
		resultsPane.setLayout(new BoxLayout(resultsPane, BoxLayout.PAGE_AXIS));
		windowContentPane.add(resultsPane);
		
		// Greeting field
		greetingField = new JTextField();
		greetingField.setEditable(false);
		windowContentPane.add(greetingField); //$NON-NLS-1$
		greetingField.setColumns(10);
		
		// Show list of matching guitars
		this.matchingGuitars = new DefaultListModel<String>();
		this.list = new JList<String>(this.matchingGuitars);
		matchingGuitars.addElement("None yet!");
		
		windowContentPane.add(list);
		
		setGreeting();
		frmRicksGuitars.pack();
	}
	
	/**
	 * Say hello
	 */
	private void setGreeting() {
		currentName = txtEnterName.getText();
		if (currentName != null && !currentName.isEmpty() && greetingField != null) {
			greetingField.setText(String.format(GREETING, currentName));
		}
	}

	/**
	 * Indicate search button if something was changed
	 */
	private void setWhenReady() {
		if (greetingField != null) greetingField.setText(String.format(WHEN_READY, getName()));
	}

	/**
	 * Indicate that nothing was found
	 */
	private void setNotFound() {
		if (greetingField != null) greetingField.setText(String.format(NOT_FOUND, getName()));
	}
	
	/**
	 * Indicate that guitars wer found
	 */
	private void setFound(int numFound) {
		if (greetingField != null) greetingField.setText(String.format(FOUND, getName(), numFound));
	}
	
	private String getName() {
		if (currentName == null || currentName.isEmpty()) return DEFAULT_NAME;
		else return currentName;
	}
	
	/**
	 * Installs a listener to receive notification when the text of any
	 * {@code JTextComponent} is changed. Internally, it installs a
	 * {@link DocumentListener} on the text component's {@link Document},
	 * and a {@link PropertyChangeListener} on the text component to detect
	 * if the {@code Document} itself is replaced.
	 * 
	 * @param text any text component, such as a {@link JTextField}
	 *        or {@link JTextArea}
	 * @param changeListener a listener to receieve {@link ChangeEvent}s
	 *        when the text is changed; the source object for the events
	 *        will be the text component
	 * @throws NullPointerException if either parameter is null
	 */
	public static void addChangeListener(JTextComponent text, ChangeListener changeListener) {
	    Objects.requireNonNull(text);
	    Objects.requireNonNull(changeListener);
	    DocumentListener dl = new DocumentListener() {
	        private int lastChange = 0, lastNotifiedChange = 0;

	        @Override
	        public void insertUpdate(DocumentEvent e) {
	            changedUpdate(e);
	        }

	        @Override
	        public void removeUpdate(DocumentEvent e) {
	            changedUpdate(e);
	        }

	        @Override
	        public void changedUpdate(DocumentEvent e) {
	            lastChange++;
	            SwingUtilities.invokeLater(() -> {
	                if (lastNotifiedChange != lastChange) {
	                    lastNotifiedChange = lastChange;
	                    changeListener.stateChanged(new ChangeEvent(text));
	                }
	            });
	        }
	    };
	    text.addPropertyChangeListener("document", (PropertyChangeEvent e) -> { //$NON-NLS-1$
	        Document d1 = (Document)e.getOldValue();
	        Document d2 = (Document)e.getNewValue();
	        if (d1 != null) d1.removeDocumentListener(dl);
	        if (d2 != null) d2.addDocumentListener(dl);
	        dl.changedUpdate(null);
	    });
	    Document d = text.getDocument();
	    if (d != null) d.addDocumentListener(dl);
	}
	
	private Inventory inventory = new Inventory();
	private String currentName = DEFAULT_NAME;

	private JFrame frmRicksGuitars;
	private JTextField txtEnterName;
	private JTextField txtEnterModel;
	private JTextField greetingField;
	
	private JComboBox<String> manufacturerComboBox;
	private JComboBox<String> typeComboBox;
	private JComboBox<String> topWoodComboBox;
	private JComboBox<String> backWoodComboBox;
	
	private JSpinner lowSpinner;
	private JSpinner highSpinner;
	
	private JList<String> list;
	private DefaultListModel<String> matchingGuitars;
	private JButton btnSearch;
	private JButton btnStop;
}
