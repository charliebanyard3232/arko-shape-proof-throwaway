// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen5685Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 2510 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 7972 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 6783 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 5690 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 5312 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 1849 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 5691 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 857 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 4147 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 2163 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 1087 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 3219 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 8820 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 1611 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage14() { return 9773 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 4885 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 6084 }
    /** Derived accessor for description (generated filler). */
    def computeDescription17() { return 5856 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount18() { return 4116 }
    /** Derived accessor for label (generated filler). */
    def computeLabel19() { return 1432 }
}
