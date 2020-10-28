package seedu.address.model.calorie;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Input's/Output's calorie count in the record
 */
public class CalorieCount {

    public static final String MESSAGE_CONSTRAINTS =
            "Calorie Count should only contain numeric characters, and it should not be blank";

    public static final String VALIDATION_REGEX = "[1-9][\\p{Digit}]*";

    public final String calorieCount;

    /**
     * Constructs a {@code CalorieCount}.
     *
     * @param calorieCount A valid calorieCount.
     */
    public CalorieCount(String calorieCount) {
        requireNonNull(calorieCount);
        checkArgument(isValidCalorieCount(calorieCount), MESSAGE_CONSTRAINTS);
        this.calorieCount = calorieCount;
    }

    public static boolean isValidCalorieCount(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return calorieCount;
    }

}

